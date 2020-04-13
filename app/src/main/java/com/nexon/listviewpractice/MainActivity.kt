package com.nexon.listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nexon.listviewpractice.adapters.RoomAdapter
import com.nexon.listviewpractice.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//  화면에 뿌려줄 아이템들이 담긴 리스트를 멤버변수로 생성
    val roomList = ArrayList<Room>()
//  어뎁터에 데이터리스트를 뿌려주기 위해 어뎁터를 객체화해서 가져오기
//  어뎁터는 onCreate()시점에 데이터를 넣어줘야하므로 일단 처음 만들때는 null로 만들고 create시점에 데이터를 넣어야함
    var mRoomAdapter : RoomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roomList.add(Room(8000, "서울시 광진구 자양동 뚝섬로 712-8", 1,"전망도 좋고 강변역 도보 10분" ))
        roomList.add(Room(12000, "서울시 서대문 광장동 66-92", 0,"신축 대단지 아파트" ))
        roomList.add(Room(5500, "경기도 수원시", -1,"학군 좋고 조용한 동네" ))
        roomList.add(Room(78000, "서울시 성북구", -1,"옥상 사용 가능 건물주와 협의" ))
        roomList.add(Room(35000, "경기도 남양주시", 12,"리모델링 완료 보러오세요~!" ))
        roomList.add(Room(4000, "청주시 흥덕구 광진구 자양동 뚝섬로 712-8", 2,"건물주 直 하시 입주 가능" ))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, roomList)
        roomListView.adapter = mRoomAdapter

//      각 아이템 터치시 수행할 로직
        roomListView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "${position+1}째 줄 선택", Toast.LENGTH_SHORT).show()
        }

//      각 아이템을 길게 터치할때 수행할 로직
        roomListView.setOnItemLongClickListener { parent, view, position, id ->
            Toast.makeText(this, "${position+1}째 줄 오래 선택", Toast.LENGTH_SHORT).show()

            return@setOnItemLongClickListener true
        }

    }
}
