/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.ArrayList;

/**
 *
 * @author Le Tan Phat
 */
public interface DAOInterface<T> {

    public int insert(T t);

    public int update(T t);

    public int delete(T t);

    public ArrayList<T> selectAll();

    public T selectByID(T t);

    public ArrayList<T> selectByCondition(String condition);
}
