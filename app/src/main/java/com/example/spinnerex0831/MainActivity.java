package com.example.spinnerex0831;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;





public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,AdapterView.OnItemSelectedListener
{
    ListView studentList;
    int clickPosition = 0;
    Spinner classList;
    TextView name,familyName,dateOfBirth,phoneNumber;
    ArrayAdapter<String> showingList;
    String classesList[] = {"Class1", "Class2", "Class3", "Class4"};
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    String class1Names[] = {"Moshe Vitus","Many Maata","Aby ron","Cleo Akash","Peter Guwisti","Jhon Konor","Jacob malor","Gari tang","Tery Levon","Morgan thucy"};
    String class1BirthDates[] = {"14.05.2008", "23.11.2008", "09.07.2008", "17.03.2008", "01.12.2008", "26.08.2008", "30.04.2008", "11.10.2008", "05.06.2008", "18.09.2008"};
    String class1PhoneNumbers[] = {"123-456-7890", "987-654-3210", "555-123-4567", "444-678-9012", "333-789-0123", "222-456-7891", "111-234-5678", "888-345-6789", "777-123-4560", "666-789-0124"};
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    String class2Names[] = {"Rick motson","Morty magol","Sonia Lvanov","Natasha Sokolov","Kylli Fulvio","Johann menton","Nikol Novikova","Eva Smirnov","Ron Visoski","Moty Timor"};
    String class2BirthDates[] = {"02.01.2008", "15.04.2008", "27.06.2008", "08.09.2008", "19.11.2008", "05.02.2008", "12.07.2008", "23.08.2008", "30.03.2008", "10.10.2008"};
    String class2PhoneNumbers[] = {"321-654-0987", "654-321-9870", "789-123-4561", "890-234-5672", "123-987-6543", "456-789-0125", "678-345-1290", "234-567-8912", "345-678-9013", "567-890-1234"};
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    String class3Names[] = {"Ethan Carter","Sophia Morales","Lucas Bennett","Isabella Ruiz","Mason Nguyen","Olivia Patel","Noah Simmons","Ava Foster","Liam Blake","Emma Sinclair"};
    String class3BirthDays[] = {"03.01.2008", "14.03.2008", "25.05.2008", "06.07.2008", "18.09.2008", "29.11.2008", "10.02.2008", "21.04.2008", "02.06.2008", "13.08.2008"};
    String class3PhoneNumbers[] = {"111-222-3333", "444-555-6666", "777-888-9999", "123-321-4567", "654-987-3210", "234-567-1234", "890-123-6789", "456-789-4321", "678-901-2345", "345-678-9876"};
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    String class4Names[] = {"Daniel Cruz","Hannah Brooks","Alexander Hayes","Chloe Ramirez","Benjamin Clarke","Emily Rivera","William Park","Natalie Hughes","James Turner","Sofia Edwards"};
    String class4BirthDays[] = {"01.02.2008", "12.04.2008", "23.06.2008", "04.08.2008", "15.10.2008", "26.12.2008", "07.03.2008", "18.05.2008", "29.07.2008", "10.09.2008"};
    String class4PhoneNumbers[] = {"222-333-4444", "555-666-7777", "888-999-1111", "432-123-4567", "567-890-3210", "678-123-8901", "901-345-6789", "234-567-3456", "789-012-4567", "890-123-5678"};
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) ->
        {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        name = findViewById(R.id.privateName);
        familyName = findViewById(R.id.familyName);
        dateOfBirth = findViewById(R.id.dateOfBirth);
        phoneNumber = findViewById(R.id.phoneNumber);
        //----------------------------------------------------------------
        studentList = findViewById(R.id.studentList);
        classList = findViewById(R.id.classes);
        //----------------------------------------------------------------
        studentList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        studentList.setOnItemClickListener(this);

        showingList = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, class1Names);
        studentList.setAdapter(showingList);
        //----------------------------------------------------------------
        classList.setOnItemSelectedListener(this);
        ArrayAdapter<String> showingClasses = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,classesList);
        classList.setAdapter(showingClasses);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        int space;
        switch (clickPosition)
        {
            case 0:
                space = class1Names[position].indexOf(" ");
                name.setText("name: "+class1Names[position].substring(0, space));
                familyName.setText("family name: "+class1Names[position].substring(space));
                dateOfBirth.setText("Birth date: "+class1BirthDates[position]);
                phoneNumber.setText("Phone number: "+class1PhoneNumbers[position]);
                break;
            case 1:
                space = class2Names[position].indexOf(" ");
                name.setText("name: "+class2Names[position].substring(0, space));
                familyName.setText("family name: "+class2Names[position].substring(space));
                dateOfBirth.setText("Birth date: "+class2BirthDates[position]);
                phoneNumber.setText("Phone number: "+class2PhoneNumbers[position]);
                break;
            case 2:
                space = class3Names[position].indexOf(" ");
                name.setText("name: "+class3Names[position].substring(0, space));
                familyName.setText("family name: "+class3Names[position].substring(space));
                dateOfBirth.setText("Birth date: "+class3BirthDays[position]);
                phoneNumber.setText("Phone number: "+class3PhoneNumbers[position]);
                break;
            case 3:
                space = class4Names[position].indexOf(" ");
                name.setText("name: "+class4Names[position].substring(0, space));
                familyName.setText("family name: "+class4Names[position].substring(space));
                dateOfBirth.setText("Birth date: "+class4BirthDays[position]);
                phoneNumber.setText("Phone number: "+class4PhoneNumbers[position]);
                break;
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        clickPosition = position;
        switch(position)
        {
            case 0:
                showingList = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,class1Names);
                studentList.setAdapter(showingList);
                break;
            case 1:
                showingList = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,class2Names);
                studentList.setAdapter(showingList);
                break;
            case 2:
                showingList = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,class3Names);
                studentList.setAdapter(showingList);
                break;
            case 3:
                showingList = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,class4Names);
                studentList.setAdapter(showingList);
                break;
            default:
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {
        showingList = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,class1Names);
        studentList.setAdapter(showingList);
    }
}