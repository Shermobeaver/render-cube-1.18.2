package dreadoom.render_cube.vertex_consumers;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;

/**
 * Is used to capture geometry, produced by entity renderers.
 */
public class DummyMultiBufferSource implements MultiBufferSource {
    /**
     * Stored vertex consumer.
     */
    public final BasicVertexConsumer buffer;

    /**
     * Constructs instance from given {@link BasicVertexConsumer}.
     * @param buffer to init instance
     */
    public DummyMultiBufferSource(BasicVertexConsumer buffer){
        this.buffer = buffer;
    }

    /**
     * Returns stored instance of {@link CommonVertexConsumer}.
     * @param type render type of object
     * @return instance of {@link CommonVertexConsumer}
     */
    @Override
    public @NotNull VertexConsumer getBuffer(@NotNull RenderType type){
        return buffer;
    }
}
