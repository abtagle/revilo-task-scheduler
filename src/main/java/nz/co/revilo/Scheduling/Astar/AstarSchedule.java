package nz.co.revilo.Scheduling.Astar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A schedule for greedy A* upper bound
 */
public class AstarSchedule implements Cloneable {
    public Set<AstarTask> _scheduled = new HashSet<>();
    public Set<AstarTask> _schedulable = new HashSet<>();
    public Set<AstarTask> _unschedulable = new HashSet<>();
    public List<AstarSchedule> _subSchedules = new ArrayList<>();
    public ArrayList<Integer> _processorLastUsed = new ArrayList<>();

    public AstarSchedule() {
    }

    /**
     * Categorizes the nodes
     * @param scheduled
     * @param schedulable
     * @param unschedulable
     * @param processorLastUsed
     */
    private AstarSchedule(Set<AstarTask> scheduled, Set<AstarTask> schedulable, Set<AstarTask> unschedulable, List<Integer> processorLastUsed) {
        _scheduled = new HashSet<>(scheduled);
        _schedulable = new HashSet<>(schedulable);
        _unschedulable = new HashSet<>(unschedulable);
        _processorLastUsed = new ArrayList<>(processorLastUsed);
    }

    /**
     * Finds maximum cost
     * @return cost
     */
    public int cost() {
        int cost = 0;
        for (Integer processorCost : _processorLastUsed) {
            if (processorCost > cost) {
                cost = processorCost;
            }
        }
        return cost;
    }

    /**
     * Deep clone the schedule
     * @return
     */
    public AstarSchedule clone() {
        return new AstarSchedule(_scheduled, _schedulable, _unschedulable, _processorLastUsed);
    }
}