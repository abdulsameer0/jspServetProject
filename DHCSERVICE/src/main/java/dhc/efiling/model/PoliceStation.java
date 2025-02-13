package dhc.efiling.model;

public class PoliceStation {
	
	private String police_station_code;
	private String police_station_name;

	public PoliceStation(String police_station_code, String police_station_name) {
		this.police_station_code = police_station_code;
		this.police_station_name = police_station_name;
	}

	public String getPolice_station_code() {
		return police_station_code;
	}

	public void setPolice_station_code(String police_station_code) {
		this.police_station_code = police_station_code;
	}

	public String getPolice_station_name() {
		return police_station_name;
	}

	public void setPolice_station_name(String police_station_name) {
		this.police_station_name = police_station_name;
	}
}
