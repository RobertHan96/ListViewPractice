package com.nexon.listviewpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nexon.listviewpractice.R
import com.nexon.listviewpractice.datas.Room

// 주 생성자 세가지 : Context, Int, ArraryList<내가만든 데이터 클래스>
class RoomAdapter (context : Context, resID:Int, list:ArrayList<Room>)  : ArrayAdapter<Room>(context, resID, list)  {
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

// Swift에서 하나의 테이블뷰 아이템을 만드는 함수와 기능이 같음
// getView는 indexpath.row와 유사함 => 각 줄에 뿌려줄 내용을 결정
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
//            미리 만들어놓은 레이아웃(XML)파일을 inf()함수를 거쳐서 내가 뿌려줄 리스트에 연결
        }
//    위에서 이미 null 체크가 끝났으므로 내가 가져올 리스트 아이템은 !!를 사용해 강제 언랩핑해서 사용 준비
        val row = tempRow!!

//    최종적으로 화면에 뿌려질 하나의 리스트(row)를 최종적으로 return
        return  row

    }

}