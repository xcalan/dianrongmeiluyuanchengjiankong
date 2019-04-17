package com.neu.entity;

public class Fur {
	
	private int id;
	private float CurrentA;
	private float CurrentB;
	private float CurrentC;
	private float ActionA;
	private float ActionB;
	private float ActionC;
	private float ECPT;
	private float current_focast_set;
	private float current_pi_feedforward;
	private float current_selfOptimize;
	private float current_self_control;
	private float current_optimize_set;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCurrentA() {
		return CurrentA;
	}
	public void setCurrentA(float currentA) {
		CurrentA = currentA;
	}
	public float getCurrentB() {
		return CurrentB;
	}
	public void setCurrentB(float currentB) {
		CurrentB = currentB;
	}
	public float getCurrentC() {
		return CurrentC;
	}
	public void setCurrentC(float currentC) {
		CurrentC = currentC;
	}
	public float getActionA() {
		return ActionA;
	}
	public void setActionA(float actionA) {
		ActionA = actionA;
	}
	public float getActionB() {
		return ActionB;
	}
	public void setActionB(float actionB) {
		ActionB = actionB;
	}
	public float getActionC() {
		return ActionC;
	}
	public void setActionC(float actionC) {
		ActionC = actionC;
	}
	public float getECPT() {
		return ECPT;
	}
	public void setECPT(float eCPT) {
		ECPT = eCPT;
	}
	public float getCurrent_focast_set() {
		return current_focast_set;
	}
	public void setCurrent_focast_set(float current_focast_set) {
		this.current_focast_set = current_focast_set;
	}
	public float getCurrent_pi_feedforward() {
		return current_pi_feedforward;
	}
	public void setCurrent_pi_feedforward(float current_pi_feedforward) {
		this.current_pi_feedforward = current_pi_feedforward;
	}
	public float getCurrent_selfOptimize() {
		return current_selfOptimize;
	}
	public void setCurrent_selfOptimize(float current_selfOptimize) {
		this.current_selfOptimize = current_selfOptimize;
	}
	public float getCurrent_self_control() {
		return current_self_control;
	}
	public void setCurrent_self_control(float current_self_control) {
		this.current_self_control = current_self_control;
	}
	public float getCurrent_optimize_set() {
		return current_optimize_set;
	}
	public void setCurrent_optimize_set(float current_optimize_set) {
		this.current_optimize_set = current_optimize_set;
	}
	@Override
	public String toString() {
		return "Fur [id=" + id + ", CurrentA=" + CurrentA + ", CurrentB="
				+ CurrentB + ", CurrentC=" + CurrentC + ", ActionA=" + ActionA
				+ ", ActionB=" + ActionB + ", ActionC=" + ActionC + ", ECPT="
				+ ECPT + ", current_focast_set=" + current_focast_set
				+ ", current_pi_feedforward=" + current_pi_feedforward
				+ ", current_selfOptimize=" + current_selfOptimize
				+ ", current_self_control=" + current_self_control
				+ ", current_optimize_set=" + current_optimize_set + "]";
	}
	
	

}
