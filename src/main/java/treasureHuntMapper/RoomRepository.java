package treasureHuntMapper;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


//extends CrudRepository
public interface RoomRepository extends PagingAndSortingRepository<Room, Long> {

}
