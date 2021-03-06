/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sk.tuke.oop.game.commands;


import sk.tuke.oop.framework.Item;
import sk.tuke.oop.game.items.BackpackImpl;

/**
 *
 * @author Peter
 */
public class TakeItem implements Command{
    
    private final BackpackImpl backpack;
    private final Item item;
    
    
    public TakeItem(BackpackImpl backpack, Item item){
        this.backpack = backpack;
        this.item = item;
    }
    
    @Override
    public void execute() {
       
           // if((item instanceof Item)&& item != null){
                
                backpack.add(item);
                item.getWorld().removeActor(item);
                
           // }
        
    }
    
}
