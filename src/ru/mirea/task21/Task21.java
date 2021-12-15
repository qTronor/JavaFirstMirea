package ru.mirea.task21;

import java.util.ArrayList;
import java.util.List;

public class Task21 {

    private List<String> branches = new ArrayList();

    public void AddBranch(String element)
    {
        branches.add(element);
    }

    public void PrintList(boolean parameter)
    {
        if(parameter)
        {
            for(int i = 0; i < branches.size(); i += 2)
            {
                System.out.println(branches.get(i));
            }
        }
        else
        {
            for(int i = 1; i < branches.size(); i += 2)
            {
                System.out.println(branches.get(i));
            }
        }
    }

    public static void main(String[] args)
    {
        Task21 obj = new Task21();
        obj.AddBranch("Sokolnicheskaya");
        obj.AddBranch("Zamoskvoretskaya");
        obj.AddBranch("Arbatsko-Pokrovskaya");
        obj.AddBranch("Filyovskaya");
        obj.AddBranch("Koltsevaya (Circle)");
        obj.AddBranch("Kaluzhsko-Rizhskaya");
        obj.AddBranch("Tagansko-Krasnopresnenskaya");
        obj.AddBranch("Kalininskaya");
        obj.AddBranch("Solntsevskaya");
        obj.AddBranch("Serpukhovsko-Timiryazevskaya");
        obj.AddBranch("Lyublinsko-Dmitrovskaya");
        obj.AddBranch("Bolshaya Koltsevaya");
        obj.AddBranch("Butovskaya");
        obj.AddBranch("Nekrasovskaya");

        System.out.println("For odd stations:");
        obj.PrintList(true);
        System.out.println();
        System.out.println("For even stations:");
        obj.PrintList(false);
    }
}
