package jsonvo;

public class Result {

	public boolean succ;
	public String msg;

	public Object data;
	public String url; // html5页面使用的跳转URL

	public Result(boolean succ, String msg, String url, Object data) {
		this.succ = succ;
		this.msg = msg;
		this.url = url;
		this.data = data;
	}

	public Result(boolean succ) {
		this(succ, null, null, null);
	}

	public Result(boolean succ, String msg) {
		this(succ, msg, null, null);
	}

	public Result(boolean succ, String msg, String url) {
		this(succ, msg, url, null);
	}

	public Result(Object data) {
		this(true, null, null, data);
	}

}
