import java.io.*;

public class Data
{

    private String title;

    private String description;

    private char[] envelopeData;

    public Data(String title, String description, String file)
    {
        this.title = title;
        this.description = description;
        envelopeData = new char[0];
        setCharData(file);
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {

        this.title = title;
    }

    public String getDesc()
    {

        return description;
    }


    public void setDesc(String description)
    {

        this.description = description;
    }


    public char[] getEnvelopeData()
    {
        return envelopeData;
    }


    public void setImage(char[] envelopeData)
    {
        this.envelopeData = envelopeData;
    }

    private void setCharData(String file_name){
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        String dir = new File(".").getAbsolutePath();

        try {
            br = new BufferedReader(new FileReader(dir + file_name));
            while ((line = br.readLine()) != null) {
                String[] string_tmp_data = line.split(cvsSplitBy);
                char[] char_tmp_data = new char[string_tmp_data.length];
                for(int index=0;index<string_tmp_data.length;index++) {
                    char_tmp_data[index] = (char) Integer.parseInt(string_tmp_data[index]);
                }
                envelopeData = Data.objArrayConcat(envelopeData, char_tmp_data);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static char[] objArrayConcat(char[] o1, char[] o2)
    {
        char[] ret = new char[o1.length + o2.length];

        System.arraycopy(o1, 0, ret, 0, o1.length);
        System.arraycopy(o2, 0, ret, o1.length, o2.length);

        return ret;
    }

}
