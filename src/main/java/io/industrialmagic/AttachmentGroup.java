package io.industrialmagic;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class AttachmentGroup {
    private IAttachment[] attachments;
	public AttachmentGroup(IAttachment... attachments)
    {
    	this.attachments = attachments;
    }
    public IAttachment[] GetAttachments()
    {
    	return this.attachments;
    }
    
    public boolean isAttached(IAttachedBlock block, IBlockAccess world, BlockPos pos){
    	if(attachments.length == 0) return false;
		
		for (int i = 0; i < attachments.length; i++) {
			IAttachment info = attachments[i];

			BlockPos attachment = pos.offset(info.getSide());
			
			IBlockState state = world.getBlockState(attachment);
			if(state != null)
			{
				Block attachedBlock = state.getBlock();
				
				if(!info.isAttached(world, attachedBlock, attachment)) 
					return false; 
			}
		}
		
		return true;
    }
}
