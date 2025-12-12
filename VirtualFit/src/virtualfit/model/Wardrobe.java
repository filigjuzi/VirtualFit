package virtualfit.model;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    private String wardrobeId;
    private List<Guest> users;

    public Wardrobe(String wardrobeId) {
        this.wardrobeId = wardrobeId;
        this.users = new ArrayList<>();
    }

    public String getWardrobeId() {
        return wardrobeId;
    }

    public void setWardrobeId(String wardrobeId) {
        this.wardrobeId = wardrobeId;
    }

    public List<Guest> getUsers() {
        return users;
    }

    public void setUsers(List<Guest> users) {
        this.users = users;
    }
}

