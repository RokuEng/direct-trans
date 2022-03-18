package util;

import data.Attribute;
import data.Field;
import data.Type;
import io.database.Database;
import io.database.PostgresSQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

import static data.Field.*;

public class TransportGenerator {

	private static Database database = new PostgresSQL();
	private static Random random = new Random();
	private static String[] LETTERS = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
	private static boolean[] STATEMENTS = {false, true};
	private static String[] MARKS = {"Audi","BMW","Ford","Honda","Hyundai","Kia","Lada","Mazda","Mitsubishi","Kamaz","Renault", "Daihatsu", "Datsun", "Lexus", "Subaru", "Skoda", "Nissan", "Volkswagen", "Toyota"};
	private static String[] CATEGORIES = {"L1", "L2", "L3", "L4", "L5", "L6", "L7", "M1", "M2", "M3", "N1", "N2", "N3"};
	private static String[] MODELS = {"Rio", "Gate", "Editor", "Map", "Fortune", "Freedom", "Skill", "Union", "Assistance", "Road"};
	private static Type[] TYPES = Type.class.getEnumConstants();

	public static void generate(int count, String tableName) {
		database.connect(tableName);
		try {
			if (count > 899) {
				throw new RuntimeException();
			}
			for(int i = 100; i < 100+count; i++) {
				database.insert(
					pickRandom(MODELS),
					new Attribute(pickRandom(CATEGORIES), CATEGORY),
					new Attribute(pickRandom(MARKS), MARK),
					new Attribute(
						pickRandom(LETTERS) + i + pickRandom(LETTERS) + pickRandom(LETTERS),
						CAR_NUMBER
					),
					new Attribute(pickRandom(STATEMENTS), HAS_TRAILER),
					new Attribute(String.valueOf((1900 + random.nextInt(123))), PRODUCTION_YEAR),
					new Attribute(pickRandom(TYPES), TS_TYPE)
				);
			}
		} catch (Exception e) {
			Logger logger = LoggerFactory.getLogger(PostgresSQL.class);
			logger.error("Error at transport generation", e);
		}
	}

	private static String pickRandom(String[] arr) {
		return arr[random.nextInt(arr.length)];
	}

	private static String pickRandom(Type[] arr) {
		return arr[random.nextInt(arr.length)].getText();
	}

	private static String pickRandom(boolean[] arr) {
		return String.valueOf(arr[random.nextInt(arr.length)]);
	}
}
