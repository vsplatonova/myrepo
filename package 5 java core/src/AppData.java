import java.util.ArrayList;

public class AppData {
    private String[] header;
    private int[][] data;
    public AppData(ArrayList<String> fileData){
        this.header=fileData.get(0).split(";");

        this.data=new int[fileData.size()-1][this.header.length];
        for (int i=1;i<fileData.size();i++){
            String[] row = fileData.get(i).split(";");

            for (int j = 0; j < row.length; j++){
                this.data[i-1][j] = Integer.parseInt(row[j]);
            }
        }
    }
}
