package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import models.MapAccountCustomer;
import exceptions.NotFoundException;

public interface MapAccountCustomerDAO {
    public MapAccountCustomer createValueObject();

    public MapAccountCustomer getObject(Connection conn, int map_id) throws NotFoundException, SQLException;

    public void load(Connection conn, MapAccountCustomer valueObject) throws NotFoundException, SQLException;

    public List loadAll(Connection conn) throws SQLException;

    public void create(Connection conn, MapAccountCustomer valueObject) throws SQLException;

    public void save(Connection conn, MapAccountCustomer valueObject) throws NotFoundException, SQLException;

    public void delete(Connection conn, MapAccountCustomer valueObject) throws NotFoundException, SQLException;

    public void deleteAll(Connection conn) throws SQLException;

    public int countAll(Connection conn) throws SQLException;

    public List searchMatching(Connection conn, MapAccountCustomer valueObject) throws SQLException;

    public int databaseUpdate(Connection conn, PreparedStatement stmt) throws SQLException;

    public void singleQuery(Connection conn, PreparedStatement stmt, MapAccountCustomer valueObject) throws NotFoundException, SQLException;

    public List listQuery(Connection conn, PreparedStatement stmt) throws SQLException;
}
