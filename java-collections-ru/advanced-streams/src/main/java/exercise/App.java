package exercise;

import java.lang.reflect.Array;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String data){
        return (String) Arrays.stream(data.split("\n"))
                .filter(str -> str.startsWith("environment"))
                .map(str -> str.replaceAll("environment=", ""))
                .map(str -> str.replaceAll("\"", ""))
                .map(str -> str.split(","))
                .flatMap(Arrays::stream)
                .filter(str -> str.startsWith("X_FORWARDED_"))
                .map(str -> str.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
