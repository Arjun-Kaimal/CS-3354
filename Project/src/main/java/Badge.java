public class Badge
{
    private String badgeName;
    private String dateReceived;
    private int pointsAwarded;

    public Badge(String bn, String dr, int pa)
    {
        badgeName = bn;
        dateReceived = dr;
        pointsAwarded = pa;
    }

    public String getBadgeName()
    {
        return badgeName;
    }

    public String getDateReceived()
    {
        return dateReceived;
    }

    public int getPointsAwarded()
    {
        return pointsAwarded;
    }

    public void setBadgeName(String bn)
    {
        badgeName = bn;
    }

    public void setDateReceived(String dr)
    {
        dateReceived = dr;
    }

    public void setPointsAwarded(int pa)
    {
        pointsAwarded = pa;
    }
}
