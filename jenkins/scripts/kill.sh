#!/usr/bin/env sh

echo 'The following command terminates the "java -jar" process using its PID'
echo '(written to ".pidfile"), all of which were conducted when "deliver.sh"'
echo 'was executed.'
set -x
kill $(cat .pidfile)
