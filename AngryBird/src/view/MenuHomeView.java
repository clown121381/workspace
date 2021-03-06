package view;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class MenuHomeView extends GameViewMenu
{

	//属性的声明适用于主页
	private JButton newButton,loadButton,optionsButton,exitButton;
	
	public MenuHomeView() {
		
        newButton = new JButton("新游戏");
        newButton.setSize(250,40);
        newButton.setLocation(frameWidth/2-115, 150);
        
        loadButton = new JButton("载入游戏");
        loadButton.setSize(250,40);
        loadButton.setLocation(frameWidth/2-115, 225);
        
        optionsButton = new JButton("控制帮助");
        optionsButton.setSize(250,40);
        optionsButton.setLocation(frameWidth/2-115, 300);
        
        exitButton = new JButton("退出游戏");
        exitButton.setSize(250,40);
        exitButton.setLocation(frameWidth/2-115, 375);
        
        backButton.setVisible(false); 
        								//在主页上没有后退按钮具有索引1添加属性是在前景
   	 	this.add(newButton,new Integer(1));
   	 	this.add(loadButton,new Integer(1));
   	 	this.add(optionsButton,new Integer(1));
   	 	this.add(exitButton,new Integer(1));
	}
	
	public JButton getNewButton()
	{
		return newButton;
	}
	
	public JButton getLoadButton()
	{
		return loadButton;
	}
	
	public JButton getOptionsButton()
	{
		return optionsButton;
	}
	
	public JButton getExitButton()
	{
		return exitButton;
	}
	
}
