package ch.spg.raidmanager.util;

import ch.spg.raidmanager.repositories.RaidmemberRepository;
import ch.spg.raidmanager.models.Raidmember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Thomas Bomatter
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

	private final RaidmemberRepository repository;

	@Autowired
	public DatabaseLoader(RaidmemberRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Raidmember("Grodien", "Druid", "Heal"));
		this.repository.save(new Raidmember("Gnoush", "Monk", "Tank"));
		this.repository.save(new Raidmember("Pitiao", "Monk", "DD"));
		this.repository.save(new Raidmember("Ginging", "Paladin", "DD"));
		this.repository.save(new Raidmember("Visp", "Paladin", "DD"));
		this.repository.save(new Raidmember("Nayrina", "Priest", "Heal"));
		this.repository.save(new Raidmember("Healdealer", "Priest", "Heal"));
		this.repository.save(new Raidmember("Tiju", "Death Knight", "Tank"));
		this.repository.save(new Raidmember("Tirrit", "Death Knight", "DD"));
		this.repository.save(new Raidmember("Sarom", "Death Knight", "DD"));
		this.repository.save(new Raidmember("Ripshadow", "Huntard", "DD"));
		this.repository.save(new Raidmember("Kalrium", "Huntard", "DD"));
		this.repository.save(new Raidmember("Bektas", "Huntard", "DD"));
		this.repository.save(new Raidmember("Namtaru", "Warlock", "DD"));
	}
}