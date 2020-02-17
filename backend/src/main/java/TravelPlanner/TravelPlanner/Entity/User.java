package TravelPlanner.TravelPlanner.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    //get all places that a user want to visit
    @OneToMany(mappedBy = "userId")
    private List<Place> visitingPlaces;

    @NotNull
    private String userName;

    @NotNull
    private String mumberSince;

    public List<Place> getVisitingPlaces() {
        return visitingPlaces;
    }

    public void setVisitingPlaces(List<Place> visitingPlaces) {
        this.visitingPlaces = visitingPlaces;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMumberSince() {
        return mumberSince;
    }

    public void setMumberSince(String mumberSince) {
        this.mumberSince = mumberSince;
    }
}
