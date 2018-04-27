package ch.spg.raidmanager.repositories;

import ch.spg.raidmanager.models.Raidencounter;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Linus Manser
 */
public interface RaidencounterRepository extends PagingAndSortingRepository<Raidencounter, Long> {

}
