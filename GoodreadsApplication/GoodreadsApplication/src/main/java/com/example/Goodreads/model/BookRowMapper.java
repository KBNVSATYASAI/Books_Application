package com.example.Goodreads.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class BookRowMapper implements  RowMapper<Book> {
    public Book mapRow(ResultSet rs,int Rownum) throws SQLException{
        return new Book(
            rs.getInt("id"),
            rs.getString("Name"),
            rs.getString("ImageUrl"));
    }
}
