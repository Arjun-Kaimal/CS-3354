public class Problem
{
    private String name;
    private String description;
    private String category;
    private int difficulty;
    private String solution;

    public Problem(String n, String de, String c, int di, String s)
    {
        name = n;
        description = de;
        category = c;
        difficulty = di;
        solution = s;
    }

    public Problem()
    {
        name = "";
        description = "";
        category = "";
        difficulty = 0;
        solution = "";
    }

    public String getSolution()
    {
        return solution;
    }

    public void setSolution(String s)
    {
        solution = s;
    }

    public int getDifficulty()
    {
        return difficulty;
    }

    public void setDifficulty(int d)
    {
        difficulty = d;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String c)
    {
        category = c;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String d)
    {
        description = d;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }
}
