package accountServer;

/**
 * Created by nikitaborodulin on 29/02/16.
 */

@SuppressWarnings("UnusedDeclaration")
public interface AccountServerControllerMBean {
    public int getUsers();

    public int getUsersLimit();

    public void setUsersLimit(int usersLimit);
}
