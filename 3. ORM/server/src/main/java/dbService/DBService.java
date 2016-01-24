package dbService;

import dbService.dataSets.UsersDataSet;

/**
 * Created by nikitaborodulin on 23/01/16.
 */
public interface DBService {
    public long addUser(String login, String password) throws DBException;
    public UsersDataSet getUserByLogin(String login) throws DBException;
}
