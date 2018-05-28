package com.project.network.ssugaeting.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.databinding.ActivityFilterBinding;

public class FilterActivity extends AppCompatActivity {
    final String[] religionArray = {"상관없음", "기독교", "천주교", "불교", "원불교", "무교"};
    final String[] hobbyArray = {"상관없음", "독서", "운동", "게임", "영화", "음악",
            "악기연주", "드라마", "프로그래밍", "드라이브", "카페",
            "맛집탐방", "외국어", "사진", "봉사", "요리", "그림"};
    final String[] collegeArray = {"상관없음", "인문대학", "자연과학대학", "법과대학", "사회과학대학",
            "경제통상대학", "경영대학", "공과대학", "IT대학"};
    final String[] circleArray = {"상관없음", "학생회", "운동", "미술", "음악",
            "토론", "방송", "사진", "과학", "신문",
            "종교", "봉사", "학술", "친목", "외국어"};
    final String[] militaryStatusArray = {"상관없음", "군필", "미필"};
    final String[] abroadExperienceArray = {"상관없음", "영어권", "비영어권"};

    ActivityFilterBinding binding;

    int ageFrom, ageTo;
    int heightFrom, heightTo;
    String fltReligion, fltHobby, fltCollege, fltCircle, fltAbrdExp, fltMltrStat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_filter);

        ArrayAdapter<String> religionAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, religionArray);
        ArrayAdapter<String> hobbyAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, hobbyArray);
        ArrayAdapter<String> collegeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, collegeArray);
        ArrayAdapter<String> circleAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, circleArray);
        ArrayAdapter<String> abroadExperienceAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, abroadExperienceArray);
        ArrayAdapter<String> militaryStatusAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, militaryStatusArray);

        religionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hobbyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        collegeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        circleAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        abroadExperienceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        militaryStatusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        binding.spFilterReligion.setAdapter(religionAdapter);
        binding.spFilterHobby.setAdapter(hobbyAdapter);
        binding.spFilterCollege.setAdapter(collegeAdapter);
        binding.spFilterCircle.setAdapter(circleAdapter);
        binding.spFilterAbroadExperience.setAdapter(abroadExperienceAdapter);
        binding.spFilterMilitaryStatus.setAdapter(militaryStatusAdapter);

        binding.btnSearchByFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ageFrom = Integer.valueOf(binding.etFilterAgeFrom.getText().toString());
                ageTo = Integer.valueOf(binding.etFilterAgeTo.getText().toString());
                heightFrom = Integer.valueOf(binding.etFilterHeightFrom.getText().toString());
                heightTo = Integer.valueOf(binding.etFilterHeightTo.getText().toString());

            }
        });

        binding.btnFilterCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        binding.spFilterReligion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fltReligion=religionArray[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                fltReligion=religionArray[0];
            }
        });

        binding.spFilterHobby.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fltHobby=hobbyArray[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                fltHobby=hobbyArray[0];
            }
        });

        binding.spFilterCollege.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fltCollege=collegeArray[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                fltCollege=collegeArray[0];
            }
        });

        binding.spFilterCircle.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fltCircle=circleArray[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                fltCircle=circleArray[0];            }
        });

        binding.spFilterAbroadExperience.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fltAbrdExp=abroadExperienceArray[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                fltAbrdExp=abroadExperienceArray[0];
            }
        });

        binding.spFilterMilitaryStatus.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fltMltrStat=militaryStatusArray[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                fltMltrStat=militaryStatusArray[0];

            }
        });
    }
}
