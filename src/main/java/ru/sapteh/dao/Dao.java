package ru.sapteh.dao;

import java.sql.SQLException;
import java.util.List;

public interface Dao <Entity, Key> {
    Entity findById(Key key);
    List <Entity> findAll();
    void save(Entity entity);
    void update (Entity entity);
    void deleteById (Key key);
}
