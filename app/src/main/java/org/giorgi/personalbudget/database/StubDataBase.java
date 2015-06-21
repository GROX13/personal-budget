package org.giorgi.personalbudget.database;

import org.giorgi.personalbudget.model.Category;

import java.util.List;

/**
 * This class is only stub it doesn't have any contact with database.
 * <p/>
 * Created by Giorgi on 6/21/2015.
 */
public class StubDataBase implements DataBaseAdapter {

    @Override
    public boolean existsDataBase() {
        return false;
    }

    @Override
    public void createDatabase() {

    }

    @Override
    public void dropDataBase() {

    }

    @Override
    public List<Category> readFromDataBase() {
        return null;
    }

    @Override
    public void saveToDataBase(List<Category> data) {

    }
}
