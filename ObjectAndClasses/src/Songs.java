import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs {

    public static class music{
        String type;
        String name;
        String time ;

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        List<music>currentMusicList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> music = Arrays.stream(scanner.nextLine().split("_")).collect(Collectors.toList());
         String type = music.get(0);
         String name = music.get(1);
         String time = music.get(2);

            music currentMusic = new music();
     currentMusic.setType(type);
     currentMusic.setName(name);
     currentMusic.setTime(time);
     currentMusicList.add(currentMusic);
        }

String command = scanner.nextLine();

        if(command.equals("all")) {
            for (music item : currentMusicList) {
                System.out.println(item.getName());
            }
        }else{
            for (music item: currentMusicList) {
                if(item.type.equals(command)){
                    System.out.println(item.getName());
                }
            }
        }

    }
}
