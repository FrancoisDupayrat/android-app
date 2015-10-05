package com.echopen.asso.echopen.model;

public class Data
{

    private String title;

    private String description;

    private char[] envelopeData;

    public Data(String title, String description, char[] envelopeData)
    {
        this.title = title;
        this.description = description;
        this.envelopeData = envelopeData;
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

}
