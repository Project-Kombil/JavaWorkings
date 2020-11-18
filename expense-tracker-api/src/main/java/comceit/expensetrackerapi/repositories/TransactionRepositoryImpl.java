package comceit.expensetrackerapi.repositories;

import comceit.expensetrackerapi.domains.Transaction;
import comceit.expensetrackerapi.exceptions.EtBadRequestException;
import comceit.expensetrackerapi.exceptions.EtResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

    private static final String SQL_CREATE = "INSERT INTO  et_transactions (transaction_id, user_id, category_id, amount, note, transaction_date) VALUES(NEXTVAL('et_transactions_seq'),?,?,?,?,?);";

    private static final String SQL_FIND_BY_ID = "SELECT transaction_id, category_id, user_id, amount, note, transaction_date FROM et_transactions WHERE user_id = ? AND category_id = ? AND transaction_id = ?;";

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Transaction> findAll(Integer userId, Integer categoryId) {
        return null;
    }

    @Override
    public Transaction findById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException {
        try{
            return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new Object[]{userId, categoryId, transactionId}, transactionRowMapper);
        } catch (Exception e){
            throw new EtResourceNotFoundException( "Transaction Not Found");
        }
    }

    @Override
    public Integer create(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException {
        try{
            KeyHolder keyHolder = new GeneratedKeyHolder();
            jdbcTemplate.update(connection -> {
                PreparedStatement ps = connection.prepareStatement(SQL_CREATE, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, userId);
                ps.setInt(2, categoryId);
                ps.setDouble(3, amount);
                ps.setString(4, note);
                ps.setLong(5, transactionDate);
                return ps;
            }, keyHolder);
            return (Integer) keyHolder.getKeys().get("transaction_id");
        } catch(Exception e) {
            throw new EtBadRequestException("Invalid Request"+SQL_CREATE+":"+userId+":"+categoryId+":"+amount+":"+note+":"+transactionDate);
        }
    }

    @Override
    public void update(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException {

    }

    @Override
    public void removeById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException {

    }

    private RowMapper<Transaction> transactionRowMapper = ((rs,rowNum) -> {
        return new Transaction(
                rs.getInt("transaction_id"),
                rs.getInt("category_id"),
                rs.getInt("user_id"),
                rs.getDouble("amount"),
                rs.getString("note"),
                rs.getLong("transaction_date")
        );
    });

}
