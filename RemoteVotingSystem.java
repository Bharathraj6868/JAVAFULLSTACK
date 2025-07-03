class RemoteVotingSystem {
    public static void main(String[] args) {
        verifyVoterIdentity(100, 50);
        verifyVoterIdentity(200, 40);
        verifyVoterIdentity(150, 60);
    }
    public static void verifyVoterIdentity(int voters, int checks) {
        int verified = voters * checks / 10;
        System.out.println(verified);
    }
}
