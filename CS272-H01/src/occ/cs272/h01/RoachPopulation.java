/**
 * CS 272 - Fall 2019
 * H01-RoachPopulation.java
 */
package occ.cs272.h01;

/**
 * @author <your OCC login name such as sgilbert>
 * @version <the date>
 *
 */
public class RoachPopulation
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "Put your login ID here";
    public static final String ASSIGNMENT = "H01-A";

    // TODO: Complete the RoachPopulation class
    private int population;

    public RoachPopulation(int r)
    {        
        population = r;
    }
    
    public void breed()
    {
        population *= 2;
    }
    public void spray()
    {
        population -= (int)(population * 0.10);
    }

    public int getRoaches()
    {
        return population;
    }

    
    
    
    
}
