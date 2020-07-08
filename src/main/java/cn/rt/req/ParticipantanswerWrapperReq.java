package cn.rt.req;

import java.util.List;

public class ParticipantanswerWrapperReq {

	private List<ParticipantanswerReq> list;

	public List<ParticipantanswerReq> getList() {
		return list;
	}

	public void setList(List<ParticipantanswerReq> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ParticipantanswerWrapperReq [list=" + list + "]";
	}
	
	
}
