package com.mrbysco.skinnedcarts.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelElephant extends ModelBase {
	public ModelRenderer cart;
	public ModelRenderer back_wall;
	public ModelRenderer front_wall;
	public ModelRenderer right_wall;
	public ModelRenderer left_wall;
	public ModelRenderer bottom;
	public ModelRenderer inner;
	public ModelRenderer head;
	public ModelRenderer trunk;
	public ModelRenderer left_ear;
	public ModelRenderer right_ear;
	public ModelRenderer left_tusk;
	public ModelRenderer right_tusk;

	public ModelElephant() {
		textureWidth = 96;
		textureHeight = 96;

		cart = new ModelRenderer(this);
		cart.setRotationPoint(0.0F, 24.0F, 8.0F);

		back_wall = new ModelRenderer(this);
		back_wall.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(back_wall);
		back_wall.cubeList.add(new ModelBox(back_wall, 0, 52, -8.0F, -10.0F, 8.0F, 16, 8, 2, 0.0F, false));

		front_wall = new ModelRenderer(this);
		front_wall.setRotationPoint(0.0F, -6.0F, -9.0F);
		setRotationAngle(front_wall, 0.0F, 3.1416F, 0.0F);
		cart.addChild(front_wall);
		front_wall.cubeList.add(new ModelBox(front_wall, 46, 22, -8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		right_wall = new ModelRenderer(this);
		right_wall.setRotationPoint(-7.0F, -6.0F, 0.0F);
		setRotationAngle(right_wall, 0.0F, -1.5708F, 0.0F);
		cart.addChild(right_wall);
		right_wall.cubeList.add(new ModelBox(right_wall, 36, 42, -8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		left_wall = new ModelRenderer(this);
		left_wall.setRotationPoint(7.0F, -6.0F, 0.0F);
		setRotationAngle(left_wall, 0.0F, 1.5708F, 0.0F);
		cart.addChild(left_wall);
		left_wall.cubeList.add(new ModelBox(left_wall, 0, 42, -8.0F, -4.0F, -1.0F, 16, 8, 2, 0.0F, false));

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(bottom);
		bottom.cubeList.add(new ModelBox(bottom, 0, 0, -8.0F, -2.0F, -10.0F, 16, 2, 20, 0.0F, false));

		inner = new ModelRenderer(this);
		inner.setRotationPoint(0.0F, 0.0F, 0.0F);
		cart.addChild(inner);
		inner.cubeList.add(new ModelBox(inner, 0, 22, -7.0F, -2.9F, -9.0F, 14, 2, 18, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 62, -4.0F, -12.0F, -7.0F, 8, 8, 5, 0.0F, false));

		trunk = new ModelRenderer(this);
		trunk.setRotationPoint(0.0F, 16.0F, -7.0F);
		setRotationAngle(trunk, -0.2618F, 0.0F, 0.0F);
		trunk.cubeList.add(new ModelBox(trunk, 26, 62, -2.0F, 0.0F, 0.0F, 4, 5, 7, 0.0F, false));

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(-4.0F, 15.0F, -4.0F);
		setRotationAngle(left_ear, 0.0F, 0.1745F, 0.0F);
		left_ear.cubeList.add(new ModelBox(left_ear, 36, 52, -5.0F, -4.0F, 0.0F, 5, 8, 2, 0.0F, true));

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(4.0F, 15.0F, -4.0F);
		setRotationAngle(right_ear, 0.0F, -0.1745F, 0.0F);
		right_ear.cubeList.add(new ModelBox(right_ear, 36, 52, 0.0F, -4.0F, 0.0F, 5, 8, 2, 0.0F, false));

		left_tusk = new ModelRenderer(this);
		left_tusk.setRotationPoint(-2.0F, 19.0F, -7.0F);
		setRotationAngle(left_tusk, 0.1745F, 0.0F, 0.0F);
		left_tusk.cubeList.add(new ModelBox(left_tusk, 0, 0, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

		right_tusk = new ModelRenderer(this);
		right_tusk.setRotationPoint(2.0F, 19.0F, -7.0F);
		setRotationAngle(right_tusk, 0.1745F, 0.0F, 0.0F);
		right_tusk.cubeList.add(new ModelBox(right_tusk, 0, 0, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		cart.render(f5);
		head.render(f5);
		trunk.render(f5);
		left_ear.render(f5);
		right_ear.render(f5);
		left_tusk.render(f5);
		right_tusk.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}