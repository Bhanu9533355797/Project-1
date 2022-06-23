package Bhanu1.services;

import Bhanu1.entity.Log;
import java.util.List;

public interface MyService {

	Log addLog(Log log);

	List<Log> getLogs();

	void deleteLog(Log log);
}
