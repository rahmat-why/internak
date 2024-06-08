package id.co.InTernak.constant;

import id.co.InTernak.model.User;

import java.util.List;

public class UserConstant {

    public static List<User> users;

    public static final String mNotFound = "User not found";
    public static final String mEmptyData = "No data available";
    public static final String mCreateSuccess = "User created successfully";
    public static final String mCreateFailed = "Failed to create User";
    public static final String mUpdateSuccess = "User updated successfully";
    public static final String mUpdateFailed = "Failed to update User";
    public static final String mDeleteSuccess = "User deleted sucessfully";
    public static final String mDeleteFailed = "Failed to delete User";
    public static final String qAllDataActive = "SELECT * FROM ms_user WHERE usr_status = ?1";

}
