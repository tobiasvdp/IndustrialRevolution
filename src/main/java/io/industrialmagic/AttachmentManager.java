package io.industrialmagic;
 
 
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
public final class AttachmentManager {

	private AttachmentManager()
	{	
	}
	
	
	public final static boolean isAttached(IAttachedBlock block, IBlockAccess world, BlockPos pos)
	{ 
		AttachmentGroup[] groups = block.getAttachedSides( world,  pos);
		if(groups.length == 0) return false;
		
		for (int i = 0; i < groups.length; i++) {
			AttachmentGroup group = groups[i];
			if(group.isAttached(block, world, pos))
				return true;
		}
		
		return false;
	}
}
