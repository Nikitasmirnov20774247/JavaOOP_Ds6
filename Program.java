import java.util.Scanner;

import models.zoo.Zoo;
import presenters.Presenter;
import views.ConsoleView;
import views.View;

public class Program
{
    public static void main(String[] args)
    {
        Scanner iScanner = new Scanner(System.in);
        Zoo javaZoo = new Zoo();
        View view = new ConsoleView(iScanner);
        Presenter presenter = new Presenter(view, javaZoo);
        presenter.Run();
        iScanner.close();
    }
}
