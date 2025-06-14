package com.springboot.collections.advancelevel.set.enumset;

import java.util.Collections;
import java.util.EnumSet;

enum UserPermission {
    READ, WRITE, EXECUTE, ADMIN;
}

public class SecurityManager {

    private final EnumSet<UserPermission> userPermissions;

    public SecurityManager(EnumSet<UserPermission> permissions) {
        this.userPermissions = permissions;
    }

    public boolean hasPermission(UserPermission permission) {
        return userPermissions.contains(permission);
    }

    public boolean hasAnyOf(EnumSet<UserPermission> requiredPermissions) {
        return !Collections.disjoint(userPermissions, requiredPermissions);
    }

    // Check if the user has all the specified permissions
    public boolean hasAllOf(EnumSet<UserPermission> requiredPermissions) {
        return userPermissions.containsAll(requiredPermissions);
    }

    // Check if the user has specific combinations of permissions
    public boolean hasReadWritePermissions() {
        return userPermissions.contains(UserPermission.READ)
                && userPermissions.contains(UserPermission.WRITE);
    }

    public boolean hasReadWriteExecutePermissions() {
        return userPermissions.containsAll(EnumSet.of(UserPermission.READ, UserPermission.WRITE, UserPermission.EXECUTE));
    }

    public static void main(String[] args) {
        // Example usage:
        EnumSet<UserPermission> user1Permissions = EnumSet.of(UserPermission.READ, UserPermission.WRITE);
        SecurityManager user1 = new SecurityManager(user1Permissions);

        System.out.println("User 1 has Read permission: " + user1.hasPermission(UserPermission.READ)); // Output: true
        System.out.println("User 1 has Execute permission: " + user1.hasPermission(UserPermission.EXECUTE)); // Output: false
        System.out.println("User 1 has any of Read or Write: " + user1.hasAnyOf(EnumSet.of(UserPermission.READ, UserPermission.EXECUTE))); // Output: true
        System.out.println("User 1 has all of Read, Write, and Execute: " + user1.hasAllOf(EnumSet.of(UserPermission.READ, UserPermission.WRITE, UserPermission.EXECUTE))); // Output: false
        System.out.println("User 1 has Read and Write permissions: " + user1.hasReadWritePermissions()); // Output: true

        // Create another user with different permissions for further testing
        EnumSet<UserPermission> user2Permissions = EnumSet.of(UserPermission.READ, UserPermission.WRITE, UserPermission.EXECUTE);
        SecurityManager user2 = new SecurityManager(user2Permissions);
        // ... (Add more test cases here) ...
    }

}
