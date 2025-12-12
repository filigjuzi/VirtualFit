package virtualfit.model;

import java.util.ArrayList;
import java.util.List;

public class Role {
    private String roleName;
    private List<String> permissions;

    public Role(String roleName) {
        this.roleName = roleName;
        this.permissions = new ArrayList<>();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}
