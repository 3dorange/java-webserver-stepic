package accountServer;

/**
 * Created by nikitaborodulin on 29/02/16.
 */
public interface AccountServerI {
    void addNewUser();

    void removeUser();

    int getUsersLimit();

    void setUsersLimit(int usersLimit);

    int getUsersCount();
}
