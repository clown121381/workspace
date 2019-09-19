package com.example;

public class Test {
	public static void main(String[] args) {
		System.out.println(new Dialog.Builder("nihao",new Dialog.OnclickListener() {
			
			@Override
			public void submit() {
				System.out.println("submit");
			}
			
			@Override
			public void cancel() {
				System.out.println("cancel");
			}
		}).biuld());
	}
}
class Dialog{
	public interface OnclickListener {
        void submit();
        void cancel();
    }
	private String title;
	private String content;
	private OnclickListener onclickListener;
	
	@Override
	public String toString() {
		return "Dialog [title=" + title + ", content=" + content + "]";
	}
	private Dialog(Builder b){
		this.content = b.content;
		this.title = b.title;
		this.onclickListener = b.onclickListener;
	}
	public OnclickListener getOnclickListener() {
		return onclickListener;
	}
	static class Builder{
		private String title;
		private String content;
		private OnclickListener onclickListener;
		public Builder(String title,OnclickListener onclickListener){
			this.title = title;
			this.onclickListener = onclickListener;
		}
		public Builder(){}
		public void setContent(String content){
			this.content = content;
		}
		public Dialog biuld(){
			return new Dialog(this);
		}
	}
}
