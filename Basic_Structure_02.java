public class Basic_Structure_02{
    public static void main(String[] args){
        System.out.println("Hello World") ;
    }
}

/*
FUNCTION ==>
    Imagine your house has a water leakage problem.

    You call a plumber.
    The plumber performs a specific task — fixing the pipe.

    👉 In Java, a function (method) is just like that plumber.

    It:
    Performs a specific job
    Is called when needed
    May take input (problem)
    May return output (fixed pipe / result)

    Example:
    void fixLeak() {
        System.out.println("Pipe fixed");
    }

    Here:

    fixLeak() = plumber
    It performs one job

    If you don’t call the plumber, nothing happens.
    Similarly, if you don’t call the method, it doesn’t execute.

CLASSES ==> 
    Instead of just one plumber, imagine a Household Repair Company.

    This company:
    Has plumbers
    Has electricians
    Has carpenters
    Has tools
    Has service rules

    👉 In Java, a Class is like that company blueprint.

    It:

    Defines what services (methods) are available
    Defines what data (variables) are stored
    Is just a blueprint
    Does not do anything until created

    Example:
    class HouseholdRepair {

        void fixLeak() {
            System.out.println("Pipe fixed");
        }

        void repairSwitch() {
            System.out.println("Switch repaired");
        }
    }

    Here:

    HouseholdRepair = company blueprint
    fixLeak() and repairSwitch() = workers (plumber, electrician)

    But still… no real work happens until we create something from it.

OBJECT ==>
    Now suppose you actually call the company.

    They send a team to YOUR house.
    That real team working at your house = Object

    👉 In Java, an Object is a real instance of a class.

    Example:
    HouseholdRepair service = new HouseholdRepair();
    service.fixLeak();

    Here:

    HouseholdRepair = blueprint (company)
    service = actual team sent to your house (object)
    
    fixLeak() = plumber doing work

    Without object → No work
    Without class → No structure
    Without method → No task
 */