package vdp.logistics.indcon.client.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.model.TRSRTransformation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
//import vdp.logistics.indcon.IndustrialConjuringMod;
//import vdp.logistics.indcon.tile.TransductTile;
//
//@SideOnly(Side.CLIENT)
//public class TESRTransduct extends TileEntitySpecialRenderer<TransductTile> {
//
//	private IModel model;
//	private IBakedModel bakedModel;
//
//	private IBakedModel getBakedModel() {
//		// Since we cannot bake in preInit() we do lazy baking of the model as
//		// soon as we need it
//		// for rendering
//		if (bakedModel == null) {
//			try {
//				model = ModelLoaderRegistry
//						.getModel(new ResourceLocation(IndustrialConjuringMod.MODID, "block/transductMov.obj"));
//			} catch (Exception e) {
//				throw new RuntimeException(e);
//			}
//			bakedModel = model.bake(TRSRTransformation.identity(), DefaultVertexFormats.ITEM,
//					location -> Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(location.toString()));
//		}
//		return bakedModel;
//	}
//
//	@Override
//	public void renderTileEntityAt(TransductTile te, double x, double y, double z, float partialTicks,
//			int destroyStage) {
//		GlStateManager.pushAttrib();
//		GlStateManager.pushMatrix();
//
//		// Translate to the location of our tile entity
//		GlStateManager.translate(x, y, z);
//		GlStateManager.disableRescaleNormal();
//
//		renderMov(te);
//
//		GlStateManager.popMatrix();
//		GlStateManager.popAttrib();
//
//	}
//
//	private void renderMov(TransductTile te) {
//		GlStateManager.pushMatrix();
//
//        long angle = (System.currentTimeMillis() / 10) % 360;
//        GlStateManager.rotate(angle, 0, 1, 0);
//
//        RenderHelper.disableStandardItemLighting();
//        
//        this.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
//        if (Minecraft.isAmbientOcclusionEnabled()) {
//            GlStateManager.shadeModel(GL11.GL_SMOOTH);
//        } else {
//            GlStateManager.shadeModel(GL11.GL_FLAT);
//        }
//
//        World world = te.getWorld();
//        // Translate back to local view coordinates so that we can do the acual rendering here
//        GlStateManager.translate(-te.getPos().getX(), -te.getPos().getY(), -te.getPos().getZ());
//
//        Tessellator tessellator = Tessellator.getInstance();
//        tessellator.getBuffer().begin(GL11.GL_QUADS, DefaultVertexFormats.BLOCK);
//        Minecraft.getMinecraft().getBlockRendererDispatcher().getBlockModelRenderer().renderModel(
//                world,
//                getBakedModel(),
//                world.getBlockState(te.getPos()),
//                te.getPos(),
//                Tessellator.getInstance().getBuffer(),true);
//        tessellator.draw();
//
//        RenderHelper.enableStandardItemLighting();
//        GlStateManager.popMatrix();
//
//	}
//
//}
