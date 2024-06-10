package intro;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonalTimings {
	
	public static void main(String[] args) {
		
		ZoneId zone = ZoneId.of("America/New_York");
		
		ZonedDateTime zt = ZonedDateTime.now(zone);
		
		System.out.println(zt);
		
		Set<String> set = ZoneId.getAvailableZoneIds();
		
		for(String value : set) {
			System.out.println(value);
		}
		
	}

}
