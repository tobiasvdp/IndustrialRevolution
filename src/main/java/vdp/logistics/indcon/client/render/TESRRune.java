package vdp.logistics.indcon.client.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.world.World;
import vdp.logistics.indcon.tile.TileRune;
import vdp.logistics.indcon.tile.TransductTile;

public class TESRRune extends TileEntitySpecialRenderer<TileRune>{
	@Override
	public void renderTileEntityAt(TileRune te, double x, double y, double z, float partialTicks,int destroyStage) {
		GlStateManager.pushAttrib();
		GlStateManager.pushMatrix();

		// Translate to the location of our tile entity
		GlStateManager.translate(x, y, z);
		GlStateManager.disableRescaleNormal();

		GlStateManager.pushMatrix();

        RenderHelper.disableStandardItemLighting();
        
		//GlStateManager.doPolygonOffset(factor, units);
		//GlStateManager.enablePolygonOffset();
        
        this.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
        if (Minecraft.isAmbientOcclusionEnabled()) {
            GlStateManager.shadeModel(GL11.GL_SMOOTH);
        } else {
            GlStateManager.shadeModel(GL11.GL_FLAT);
        }

        
        World world = te.getWorld();

        Tessellator tessellator = Tessellator.getInstance();
        VertexBuffer vb = tessellator.getBuffer();
        vb.begin(GL11.GL_QUADS, DefaultVertexFormats.BLOCK);
        //vb.
        tessellator.draw();

        RenderHelper.enableStandardItemLighting();
        GlStateManager.popMatrix();

		//GlStateManager.disablePolygonOffset();


		GlStateManager.popMatrix();
		GlStateManager.popAttrib();

	}
}
