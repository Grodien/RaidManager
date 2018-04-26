package ch.spg.raidmanager.repositories;

import ch.spg.raidmanager.models.Raidmember;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author @author Thomas Bomatter
 */
public interface RaidmemberRepository extends PagingAndSortingRepository<Raidmember, Long> {

}
