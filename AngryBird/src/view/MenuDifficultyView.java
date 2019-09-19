package view;

import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MenuDifficultyView extends GameViewMenu
{


	//属性的声明已经适应页面的难度的选择
	private JLabel difficultyLabel;
	private JButton easyButton, mediumButton, hardButton, extremeButton;
	private String parentPanel="";
	
	public MenuDifficultyView()
	{
		
        difficultyLabel = new JLabel("选择难度 :");
        difficultyLabel.setSize(220, 40);
        difficultyLabel.setLocation(frameWidth/2-100,150);
		
        easyButton = new JButton("容易");
        easyButton.setSize(220,40);
        easyButton.setLocation(frameWidth/2-100, 225);
        
        mediumButton = new JButton("中等");
        mediumButton.setSize(220,40);
        mediumButton.setLocation(frameWidth/2-100, 275);
        
        hardButton = new JButton("困难");
        hardButton.setSize(220,40);
        hardButton.setLocation(frameWidth/2-100, 325);
        
        extremeButton = new JButton("噩梦");
        extremeButton.setSize(220,40);
        extremeButton.setLocation(frameWidth/2-100, 375);
        

        //具有索引1添加属性是在前景
   	 	this.add(difficultyLabel,new Integer(1));
   	 	this.add(easyButton,new Integer(1));
   	 	this.add(mediumButton,new Integer(1));
   	 	this.add(hardButton,new Integer(1));
   	 	this.add(extremeButton,new Integer(1));
	}
	
	public JButton getEasyButton()
	{
		return easyButton;
	}
	
	public JButton getMediumButton()
	{
		return mediumButton;
	}
	
	public JButton getHardButton()
	{
		return hardButton;
	}
	
	public JButton getExtremeButton()
	{
		return extremeButton;
	}
	
	public String getParentPanel()
	{
		return this.parentPanel;
	}
	
	public void setParentPanel(String parent)
	{
		this.parentPanel=parent;
	}
}
