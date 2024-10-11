#include <iostream>
#include <string>
using namespace std;

//Use a money saver to double the amount you entered?

int main()
{
    int money;
    
    int option;
    int attempts = 1;
    string choice;
    string ans;
    srand((unsigned) time(NULL));
    cout << "Welcome to the Casino." << endl;
    cout << "Enter if you'll like to play: \nHere: " << endl;
    cin >> ans;
    if(ans == "no")
    {
        cout << "Alri, later" << endl;
        return 0;
    }
    cout << "Enter how much you'll be bettting. \nEnter: " << endl;
    cin >> money;
    if(money<=150)
    {
        cout << "Too low. Try again" << endl;
        return 0;
    }
    int inti_money = money;
    cout << "Good and remember all payments are final.\nSo which game would you like to play? \nThe Wheel[0] or Guessing[1]" << endl;
    cin >> option;
    switch(option)
    {
        case 0:
        while(ans == "yes")
        {
            int j = rand() % 10;
            int k = rand() % 10;
            int l = rand() % 10;
            cout << j << k << l << endl;
            if (j == k && k == l)
            {
                cout << "Ding Ding, You won!" << endl;
                money = inti_money * 20;
                cout << "Here's how much you have remaining: " << money << endl;
                return 0;
            }
            else if (j == 9 && k == 1 && l == 7) // Easter Egg looool
            {
                cout << "Ding Ding, You won!" << endl;
                money = money * 500;
                cout << "Here's how much you have remaining: " << money << endl;
                return 0; 
            }
            else
            {
                money-=50;
                if(money == 0)
                {
                    cout << "Sorry but you ran out of money before you won" << endl;
                    return 0;
                }
            }
        }
        case 1:
        int tries = 5;
        while (ans == "yes")
        {
            int x = rand() % 11;
            int y;
            cout << "Enter the number to guess: " << endl;
            cin >> y;
            if(y==x)
            {
                cout << "Ding Ding!!" << endl;
                int total;
                total = money * 10;
                if (attempts>1)
                {
                    total = total * attempts;
                }
                cout << "Here's your total: " << total << endl;
                cout << "Would you like to play again? \nEnter here: " << endl;
                cin >> choice;
                if(choice=="yes")
                {
                    attempts++;
                    tries = 5;
                    continue;
                }
                cout << "Here's your final total: " << total << endl;
                break;
            }
            else
            {
                tries--;
                cout << "You have " << tries << " tries remaining" << endl;
                if(tries==0)
                {
                    cout << "You lose" << endl;
                    int nothing = 0;
                    cout << "You have " << nothing << " money remaining" << endl;
                    break;
                }
            }

        }
    }
}
